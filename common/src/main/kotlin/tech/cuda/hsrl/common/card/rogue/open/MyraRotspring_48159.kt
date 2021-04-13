package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MyraRotspring_48159 : Card() {
    override val id = 48159
    override val name = "迈拉·腐泉"
    override val description = "<b>战吼：</b> <b>发现</b>一张<b>亡语</b>随从牌，并获得其<b>亡语</b>。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她上班第一天，就把实验室的烟雾报警器给拆了。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b522125b3fe0b83d88d976a8d5235dd1945a4ab232a2f2d6cc781c8a286c4fb4.png"
}
