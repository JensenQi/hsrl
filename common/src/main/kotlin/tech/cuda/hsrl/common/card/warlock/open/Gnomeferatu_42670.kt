package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gnomeferatu_42670 : Card() {
    override val id = 42670
    override val name = "侏儒吸血鬼"
    override val description = "<b>战吼：</b>移除你对手的牌库顶的一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "她更喜欢别人叫她“吸血靓妹”。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f7bb49e9bd92676bab502e121968fecba8701de5c19afa7c68c49a28a966b8a.png"
}
