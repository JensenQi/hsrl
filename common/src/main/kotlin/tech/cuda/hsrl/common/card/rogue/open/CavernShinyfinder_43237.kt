package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CavernShinyfinder_43237 : Card() {
    override val id = 43237
    override val name = "洞穴探宝者"
    override val description = "<b>战吼：</b>从你的牌库中抽一张武器牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "这里除了喷香的蜡烛，还有些非常锋利的家伙……"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e07718fef165a7562a43d46e7848609628488c4e47005e9d96196769e2854d7c.png"
}
