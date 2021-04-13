package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BalefulBanker_48039 : Card() {
    override val id = 48039
    override val name = "恶毒的银行家"
    override val description = "<b>战吼：</b>选择一个友方随从，将一个复制洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "他重金投资了数字货币。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ad0910908ee742768b3efb0be9df8675744c899c30ed729c72b89c453f327fb.png"
}
