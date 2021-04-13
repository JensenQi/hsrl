package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WorgenAbomination_46655 : Card() {
    override val id = 46655
    override val name = "狼人憎恶"
    override val description = "在你的回合结束时，对所有其他受伤的随从造成2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "请狼来做客，活得不耐烦。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99ab6b50cc98bba357d574b70fc31df56611d05351e01d4cebb0a15499b33be2.png"
}
