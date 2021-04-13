package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MaskedContender_50421 : Card() {
    override val id = 50421
    override val name = "蒙面选手"
    override val description = "<b>战吼：</b> 如果你控制一个<b>奥秘</b>，则从你的牌库中施放一个<b>奥秘</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "早在神秘挑战者还是神秘侍从的时候，他们就是老相识了。"
    override val artist = "Alex Horley Ormandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ff0c392c868a6fdfad8ac215b18e8f10d380b96f8ed5c86a3887a3ad4c1570d5.png"
}
