package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThorngrowthSentries_63021 : Card() {
    override val id = 63021
    override val name = "荆棘护卫"
    override val description = "召唤两只1/2并具有<b>嘲讽</b>的龟。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "也许我们不该喝这片绿洲里的水……"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22d90b4602af06b906e30b0d09625e461f6ae10978ede31b380d0bc84506ea2e.png"
}
