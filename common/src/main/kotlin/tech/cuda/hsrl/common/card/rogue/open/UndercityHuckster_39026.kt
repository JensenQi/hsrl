package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UndercityHuckster_39026 : Card() {
    override val id = 39026
    override val name = "幽暗城商贩"
    override val description = "<b>亡语：</b>随机将一张<i>（你对手职业的）</i>卡牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "嘿，想来几张对手职业的卡牌吗？别问从哪儿搞来的，知道太多对你没好处。"
    override val artist = "Jon Neimeister"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b46674e4556a19f8271c78dc02772a674ed74087201d2362107be5572d0842e8.png"
}
