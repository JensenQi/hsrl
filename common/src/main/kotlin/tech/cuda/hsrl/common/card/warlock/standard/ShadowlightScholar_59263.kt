package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowlightScholar_59263 : Card() {
    override val id = 59263
    override val name = "影光学者"
    override val description = "<b>战吼：</b>摧毁一张你牌库中的灵魂残片，造成3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "掌握了灵魂魔法，你就能用它解决断电后的阅读灯光问题。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68090145ff08221466579e1c808ebfe86072255a6e0ac00bc58642ad5196f38f.png"
}
