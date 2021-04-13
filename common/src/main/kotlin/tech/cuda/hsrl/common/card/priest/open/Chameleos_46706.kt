package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Chameleos_46706 : Card() {
    override val id = 46706
    override val name = "变色龙卡米洛斯"
    override val description = "如果这张牌在你的手牌中，每个回合都会变成你对手手牌中的一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "变换转瞬间，造化钟神秀。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01ac69c99507792558da69d45d4e3f7d5e58a4aacd071229de8e2314dfaace9b.png"
}
