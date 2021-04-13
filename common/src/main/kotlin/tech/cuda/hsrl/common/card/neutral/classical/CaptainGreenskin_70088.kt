package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CaptainGreenskin_70088 : Card() {
    override val id = 70088
    override val name = "绿皮船长"
    override val description = "<b>战吼：</b>使你的武器获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "要不是因为那些调皮捣蛋的小家伙们，他差点就把那艘超级战舰开进暴风城港口了！"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/37f55b2b1cfb0d304c32ced1e2b7e5ec9a0fdc7dda6100489b6165a4d369986e.png"
}
