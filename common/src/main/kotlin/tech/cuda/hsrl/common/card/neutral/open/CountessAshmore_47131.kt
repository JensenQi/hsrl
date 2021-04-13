package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CountessAshmore_47131 : Card() {
    override val id = 47131
    override val name = "女伯爵阿莎摩尔"
    override val description = "<b>战吼：</b>从你的牌库中抽一张<b>突袭</b>牌、<b>吸血</b>牌和<b>亡语</b>牌。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "“一个随从，两个随从，三个随从……呃……我数到哪儿了？”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0904b96f05c606dab6c4a7199ca038ab39c1088135c959b99a88eee860a1e9fa.png"
}
