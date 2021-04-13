package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rally_61947 : Card() {
    override val id = 61947
    override val name = "开赛集结"
    override val description = "复活法力值消耗为（1），（2），（3）的友方随从 各一个。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "一通鼓，松鼠到；二通鼓，侏儒叫；三通鼓，争荣耀；四通鼓，跑跑跑！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c90e07a5443eade0a6304900d438d3de53e88a4502ab123d795824d75f64e0b1.png"
}
