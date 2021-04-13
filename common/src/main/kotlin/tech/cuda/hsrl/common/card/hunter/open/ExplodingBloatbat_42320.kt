package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplodingBloatbat_42320 : Card() {
    override val id = 42320
    override val name = "自爆肿胀蝠"
    override val description = "<b>亡语：</b>对所有敌方随从造成2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "祸兮蝠之所倚，蝠兮祸之所伏。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e116adff786ef105078d9adf3c99068d11408f266a3ebe8103cf610d443a18e1.png"
}
