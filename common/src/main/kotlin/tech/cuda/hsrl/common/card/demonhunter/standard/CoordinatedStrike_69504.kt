package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoordinatedStrike_69504 : Card() {
    override val id = 69504
    override val name = "协同打击"
    override val description = "召唤三个1/1并具有<b>突袭</b>的伊利达雷。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "三人行，必有舞师。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c6ecf9b4efdc0067c4b9ce9b71ec266494cb7bb200b8ceab85ff7ef29815825d.png"
}
