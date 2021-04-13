package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathsHeadCultist_62744 : Card() {
    override val id = 62744
    override val name = "亡首教徒"
    override val description = "<b>嘲讽</b>，<b>亡语：</b>为你的英雄恢复4点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "死亡无可阻挡。但如果你有个能嘲讽，会治疗的随从，那就不一样了。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aff186b20ecffdccd3316f248abf0dbcb31b661b6470b708ea08e80a018dc42c.png"
}
