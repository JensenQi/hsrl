package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HenchClanHogsteed_52935 : Card() {
    override val id = 52935
    override val name = "荆棘帮斗猪"
    override val description = "<b>突袭，亡语：</b>召唤一个1/1的鱼人。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "不会骑猪的马仔不是好鱼人。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ddc5f427d2f629c21c82a8b26cfdea76e5571cd52e85ac3bf402eb032022698.png"
}
