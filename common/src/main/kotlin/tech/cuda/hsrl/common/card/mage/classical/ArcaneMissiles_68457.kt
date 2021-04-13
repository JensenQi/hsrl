package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneMissiles_68457 : Card() {
    override val id = 68457
    override val name = "奥术飞弹"
    override val description = "造成 3点伤害，随机分配到所有敌方角色身上。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "既然你想要做一个超级厉害的法师，就必须得把奥术飞弹控制得好一些。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/176947964610e81ad99278fd3f2c039d82272f93679bb56dd193d8f8e3708293.png"
}
