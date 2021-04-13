package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FloopsGloriousGloop_48837 : Card() {
    override val id = 48837
    override val name = "弗洛普的神奇黏液"
    override val description = "在本回合中，每当一个随从死亡，便获得一个仅限本回合可用的法力水晶。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "种子不让黏液黏在种子上，黏液偏要黏在种子上。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56bacc92756e8654c9f5478edf2bea0229ff0c3cda9aad7e6beb521abfb0c56f.png"
}
