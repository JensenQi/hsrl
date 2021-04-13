package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeeperOfTheGrove_601 : Card() {
    override val id = 601
    override val name = "丛林守护者"
    override val description = "<b>抉择：</b>造成2点伤害；或者<b>沉默</b>一个随从。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "这些家伙不知道从哪儿冒出来，然后就自说自话地开始守护你的丛林了。"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4981f946e47065ac97da5b4f2389946a05c70c07bea2f8d81f552b4b367fde8d.png"
}
