package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ambush_56524 : Card() {
    override val id = 56524
    override val name = "伏击"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，召唤一个2/3并具有<b>剧毒</b>的伏击者。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "咔哒，咔哒……咔哒——唰！"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7038c30d9405e8a2d7fc4dced4640ccfd81909aa43cb35f5536cb32a30e81f1.png"
}
