package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MenagerieMagician_39269 : Card() {
    override val id = 39269
    override val name = "展览馆法师"
    override val description = "<b>战吼：</b>随机使一个友方野兽，龙和鱼人获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "每当他有新的戏法时，就会引来众多的围观及解密。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/654fcfb1995b5cffcd1074635c1879f16aabbcfddd3b0afed751bcf850b32ae7.png"
}
