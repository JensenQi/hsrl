package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PortalKeeper_52707 : Card() {
    override val id = 52707
    override val name = "传送门守护者"
    override val description = "<b>战吼：</b>将三张传送门洗入你的牌库。当抽到传送门时，召唤一个2/2并具有<b>突袭</b>的恶魔。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "大家都不让它来当“鬼”。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8d3d26bbd2254784fb35ab17618336a4ca5d435fc55f50166c71080ec8a110d.png"
}
