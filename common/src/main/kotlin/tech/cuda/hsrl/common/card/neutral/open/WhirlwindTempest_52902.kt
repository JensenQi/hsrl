package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WhirlwindTempest_52902 : Card() {
    override val id = 52902
    override val name = "暴走旋风"
    override val description = "使你具有<b>风怒</b>的随从获得<b>超级风怒</b>。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "超级风怒的随从表示有点……懵。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89d14b6a6525dccf19fbc31a6dd3fbca9cb0a1a80ceffc3d8716c56f86e5d561.png"
}
