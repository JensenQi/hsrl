package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UniteTheMurlocs_41499 : Card() {
    override val id = 41499
    override val name = "鱼人总动员"
    override val description = "<b>任务：</b>召唤10个鱼人。 <b>奖励：</b>老鲨嘴。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "山上的朋友，树上的朋友，水里的朋友，请举起你们的双蹼！让正义的鱼人来拯救艾泽拉斯！"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d8be1d42c2e9123093a541b1103f618ac3f3b32752a411d7fcc6164d60dcc338.png"
}
