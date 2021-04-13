package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlakirTheWindlord_32 : Card() {
    override val id = 32
    override val name = "风领主奥拉基尔"
    override val description = "<b>冲锋，圣盾，嘲讽，风怒</b>"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "他是四大元素领主中最弱的一个。而另外三个总是会提醒他这一点。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ba4a399d213d2eb990bd2a7166bf2699d47dc9f6d2758d0971d0a7023c0c8bd.png"
}
