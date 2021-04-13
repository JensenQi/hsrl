package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaitedArrow_50466 : Card() {
    override val id = 50466
    override val name = "诱饵射击"
    override val description = "造成 3点伤害。<b>超杀：</b>召唤一个5/5的魔暴龙。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "牌是普通牌，可这一分熟的牛排倒很稀有。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9698de688f27611c161f568c11e15ca5bae253e9f9fefe460d7edebc865c2973.png"
}
