package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Skelemancer_42328 : Card() {
    override val id = 42328
    override val name = "骷髅法师"
    override val description = "<b>亡语：</b>如果此时是你对手的回合，则召唤一个8/8的骷髅。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "精通死灵的只能叫死灵法师，精通骷髅的才能叫骷髅法师。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f61369b19367e052a2693ef2aee2eb81cfc4de90182b363d0f9936bb674bf039.png"
}
