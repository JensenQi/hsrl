package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlakirTheWindlord_69632 : Card() {
    override val id = 69632
    override val name = "风领主奥拉基尔"
    override val description = "<b>冲锋，圣盾，嘲讽，风怒</b>"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "他是四大元素领主中最弱的一个。而另外三个总是会提醒他这一点。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8d6a5f261b11727a05452aceaa9437947367fb2f03da421fbf46edc8db733eec.png"
}
