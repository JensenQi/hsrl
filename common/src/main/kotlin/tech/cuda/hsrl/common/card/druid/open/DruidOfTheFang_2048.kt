package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheFang_2048 : Card() {
    override val id = 2048
    override val name = "尖牙德鲁伊"
    override val description = "<b>战吼：</b>如果你控制任何野兽，将该随从变形成为7/7。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "尖牙德鲁伊生活在哀嚎洞穴里，于是那里成为了大部分部落冒险者第一次遇到暗夜精灵的地方。"
    override val artist = "Brandon Kitkouski"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a19a83125f78d87ed8752c101d67b69a43c1d21d0e25e7a89f661c356ce44a4.png"
}
