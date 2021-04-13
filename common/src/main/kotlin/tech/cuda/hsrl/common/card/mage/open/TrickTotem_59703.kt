package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TrickTotem_59703 : Card() {
    override val id = 59703
    override val name = "戏法图腾"
    override val description = "在你的回合结束时，随机施放一个法力值消耗小于或等于（3）点的法术。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "神奇！就像雷诺那么神奇！"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d06cdb80db5d9b0e65c81f9bbcc7494d0395c198a0a44ed1f17f5bd5bc68fa13.png"
}
