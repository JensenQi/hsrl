package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ReliquaryOfSouls_57166 : Card() {
    override val id = 57166
    override val name = "灵魂之匣"
    override val description = "<b>吸血</b> <b>亡语：</b>将“终极魂匣”洗入你的牌库。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "三张脸分别代表愤怒，欲望和苦难。恰似午夜公会团。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c3499fe4a7834b66b25bd1458a811127b3f19be03034e311ed92a96a952b41e.png"
}
