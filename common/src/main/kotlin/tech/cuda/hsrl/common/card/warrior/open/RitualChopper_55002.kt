package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RitualChopper_55002 : Card() {
    override val id = 55002
    override val name = "仪式斩斧"
    override val description = "<b>战吼：</b><b> 祈求</b>迦拉克隆。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "快砍！迦拉克隆显灵了！"
    override val artist = "Lloyd Hoshide"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3553ad5f510e7de79253f6c6ee5a1e3dd77fce482b82bdce0c05e5c43777e97.png"
}
