package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KanrethadEbonlocke_56534 : Card() {
    override val id = 56534
    override val name = "坎雷萨德·埃伯洛克"
    override val description = "你的恶魔牌法力值消耗减少（1）点。<b>亡语：</b>将“终极坎雷萨德”洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "伊利丹败落之后，坎雷萨德组建了黑暗收割议会来研究伊利丹的邪能魔法。据说他羡慕得……眼睛都绿了。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1bb77600f27b9e6251596c29eefd5f4e1d605320ec486827fdb1a2173f590192.png"
}
