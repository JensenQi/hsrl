package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LothraxionTheRedeemed_61191 : Card() {
    override val id = 61191
    override val name = "救赎者洛萨克森"
    override val description = "<b>战吼：</b>在本局对战的剩余时间内，在你召唤一个白银之手新兵后，使其获得<b>圣盾</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "体内灌注的圣光过于耀眼，晚上睡觉的时候不得不戴上双层眼罩。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f0f2561759b6e312b1ff6dacfe3ef982f6cd9b9b4d3aaaac155b34f459bc71f5.png"
}
