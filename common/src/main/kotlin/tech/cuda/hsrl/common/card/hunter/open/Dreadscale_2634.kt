package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dreadscale_2634 : Card() {
    override val id = 2634
    override val name = "恐鳞"
    override val description = "在你的回合结束时，对所有其他随从造成 1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "有酸喉这个老伙计在，就没有嚼不烂的骑士。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66e9e4a6609d37a987ad283faa3d232bace0433f0f56859a9bc3479f61a8f069.png"
}
