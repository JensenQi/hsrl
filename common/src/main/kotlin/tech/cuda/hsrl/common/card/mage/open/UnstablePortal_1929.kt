package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnstablePortal_1929 : Card() {
    override val id = 1929
    override val name = "不稳定的传送门"
    override val description = "随机将一张随从牌置入你的手牌。该牌的法力值消耗减少（3）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "艾泽拉斯的普通住民根本不知道让一座传送门稳定下来需要花费多少人力物力。我们每年要花费30%的GDP用于传送门维护。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c2d225df976a3fadfac580daf2ce57cb3a831a5085bf6e39417519ac6086d616.png"
}
