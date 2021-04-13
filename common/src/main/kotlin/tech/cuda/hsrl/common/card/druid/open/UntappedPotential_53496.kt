package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UntappedPotential_53496 : Card() {
    override val id = 53496
    override val name = "发掘潜力"
    override val description = "<b>任务：</b>在有未使用的法力水晶的情况下结束4个回合。 <b>奖励：</b>奥斯里安之泪。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "伏笔，有时候也是一种战术。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89561e60b8d41cdca3ac4acc0f74dde9bc76adc56c8be7936caf84b34cda0a40.png"
}
