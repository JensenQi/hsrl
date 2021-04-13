package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlakirTheWindlord_70078 : Card() {
    override val id = 70078
    override val name = "风领主奥拉基尔"
    override val description = "<b>冲锋，圣盾，嘲讽，风怒</b>"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "他是四大元素领主中最弱的一个。而另外三个总是会提醒他这一点。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a911647e26d4d483f99df2a0ba78f92c296142b0ae287331cfc5f1b13911cae.png"
}
