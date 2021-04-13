package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ApothecaryHelbrim_62895 : Card() {
    override val id = 62895
    override val name = "药剂师赫布瑞姆"
    override val description = "<b>战吼，亡语：</b>随机将一张药膏置入你的 手牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "想维持健康精气神，先毒翻身边所有人。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9dc1e3ca13ce8b3c0ba3b690d41cb91e1e2e0768c37003f222f3f7af9db6f1cd.png"
}
