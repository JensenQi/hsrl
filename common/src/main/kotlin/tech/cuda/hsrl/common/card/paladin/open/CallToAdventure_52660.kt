package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CallToAdventure_52660 : Card() {
    override val id = 52660
    override val name = "冒险号角"
    override val description = "从你的牌库中抽取法力值消耗最低的随从牌，使其获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "即便是最渺小的随从也能左右整局对战的结果。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32bc0149427cc9221d7b0a2d8e5dbd42c33fc97a15d62f2557d7f81c3ff1b570.png"
}
