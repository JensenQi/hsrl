package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HiddenOasis_53576 : Card() {
    override val id = 53576
    override val name = "隐秘绿洲"
    override val description = "<b>抉择：</b>召唤一棵6/6并具有<b>嘲讽</b>的古树；或恢复 12点 生命值。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "周围栽着六米多高的老树人，这片绿洲仍能保持隐秘，真是太神奇了。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0fe24ad68b1c5aa9facf61405b459057fdc14b74e6b4a9551a0e95e167846f56.png"
}
