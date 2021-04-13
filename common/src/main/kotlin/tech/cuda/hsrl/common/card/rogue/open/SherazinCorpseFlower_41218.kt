package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SherazinCorpseFlower_41218 : Card() {
    override val id = 41218
    override val name = "“尸魔花”瑟拉金"
    override val description = "<b>亡语：</b>进入<b>休眠</b>状态。在一回合中使用四张牌可唤醒该随从。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "始祖龟园丁的噩梦。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29c086c0fbc874eab17e837338d8abacf6bf699070269a82a9840a010c059b97.png"
}
