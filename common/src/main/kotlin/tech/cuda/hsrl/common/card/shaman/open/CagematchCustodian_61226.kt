package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CagematchCustodian_61226 : Card() {
    override val id = 61226
    override val name = "笼斗管理员"
    override val description = "<b>战吼：</b> 抽一张武器牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "你负责打架，它负责打扫。"
    override val artist = "Tang Ruiqian"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b667a5f395ee000c352671e10288477e8bfc306f663909d75e486c8e0f8d08cb.png"
}
