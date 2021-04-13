package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stablemaster_2639 : Card() {
    override val id = 2639
    override val name = "兽栏大师"
    override val description = "<b>战吼：</b>在本回合中，使一个友方野兽获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "比起那些五大三粗的男人而言，她在照顾宠物方面显然用心多了。"
    override val artist = "Tyson Murphy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88af4cea7fdc83b791d336cdf4a8f13a8437040e0d899e3a061155a49ca9670f.png"
}
