package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarsongCommander_69549 : Card() {
    override val id = 69549
    override val name = "战歌指挥官"
    override val description = "在你召唤另一个随从后，使其获得 <b>突袭</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "战歌氏族中闹剧不断，什么三教九流的人都能当上他们的指挥官。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3aecdcfc9cea71b03cb31936c35e69fd46c81b5d6c9cadc451a6bb8c39293b96.png"
}
