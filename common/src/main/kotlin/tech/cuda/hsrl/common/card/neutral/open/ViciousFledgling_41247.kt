package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ViciousFledgling_41247 : Card() {
    override val id = 41247
    override val name = "凶恶的雏龙"
    override val description = "在该随从攻击一方英雄后，获得<b>进化</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "它渴望成长，渴望到发狂。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be773f72cc8a385ce8cc1567dec6bcf9bb554e370911914f264aa307f74243e4.png"
}
