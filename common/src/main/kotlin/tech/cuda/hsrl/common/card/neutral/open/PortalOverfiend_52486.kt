package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PortalOverfiend_52486 : Card() {
    override val id = 52486
    override val name = "传送门大恶魔"
    override val description = "<b>战吼：</b>将三张传送门洗入你的牌库。当抽到传送门时，召唤一个2/2并具有<b>突袭</b>的恶魔。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "感觉就像是恶魔们在玩捉鬼游戏。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6edbe933fe5a0a95f0854efa1ba0fa2b293247e84f90585fbf163b1b80376736.png"
}
