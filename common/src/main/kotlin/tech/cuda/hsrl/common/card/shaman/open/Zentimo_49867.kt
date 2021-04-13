package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Zentimo_49867 : Card() {
    override val id = 49867
    override val name = "泽蒂摩"
    override val description = "每当你以一个随从为目标施放法术时，对该随从相邻的随从再次施放。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "平静，祥和，仿佛看到……一群青蛙。"
    override val artist = "Evgeniy Zagumyennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1bd41fc61283b9ec9329b0143c59ef4d6921e6f4b7d3e5627ab08d62837d0bdd.png"
}
