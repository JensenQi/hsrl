package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DimensionalRipper_51734 : Card() {
    override val id = 51734
    override val name = "空间撕裂器"
    override val description = "召唤你的牌库中一个随从的两个复制。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "一台空间撕裂器确定一个点，两台可以确定一个平面，三台就可以确定一个立体空间了！"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/52c41811c1504884f5bba2a7444b9dc00c49204abbdab70310c4092deeefa4a9.png"
}
