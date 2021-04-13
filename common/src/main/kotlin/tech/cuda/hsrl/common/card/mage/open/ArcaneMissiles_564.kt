package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneMissiles_564 : Card() {
    override val id = 564
    override val name = "奥术飞弹"
    override val description = "造成 3点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "既然你想要做一个超级厉害的法师，就必须得把奥术飞弹控制得好一些。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71606242f4e2f8014367adf3bcf5fb0019db2486c31dc7db83c4ceca44db73f0.png"
}
