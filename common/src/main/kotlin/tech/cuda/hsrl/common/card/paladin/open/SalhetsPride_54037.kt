package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SalhetsPride_54037 : Card() {
    override val id = 54037
    override val name = "萨赫特的傲狮"
    override val description = "<b>亡语：</b>从你的牌库中抽两张生命值为1的随从牌。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "它信奉骄矜必胜。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbe8f597891109de688f465015bf52d256b99aea272304895d24497b891c2294.png"
}
