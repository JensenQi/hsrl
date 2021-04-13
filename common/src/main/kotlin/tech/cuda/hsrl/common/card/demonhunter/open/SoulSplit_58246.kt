package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulSplit_58246 : Card() {
    override val id = 58246
    override val name = "灵魂分裂"
    override val description = "选择一个友方恶魔，召唤一个它的复制。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "剧透：这两个都是黑化的反派。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5de6f9b6bf5a37bc062dff951a1b6fdf530eac1aba2b6ace2bd869e269ddf86f.png"
}
