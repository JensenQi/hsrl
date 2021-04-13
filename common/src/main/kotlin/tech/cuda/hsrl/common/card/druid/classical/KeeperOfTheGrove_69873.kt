package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeeperOfTheGrove_69873 : Card() {
    override val id = 69873
    override val name = "丛林守护者"
    override val description = "<b>抉择：</b>造成2点伤害；或者<b>沉默</b>一个随从。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "这些家伙不知道从哪儿冒出来，然后就自说自话地开始守护你的丛林了。"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71c57a38167344a981e05c39aef92e22c9a1d36b1ff712f760550c5684a2f637.png"
}
