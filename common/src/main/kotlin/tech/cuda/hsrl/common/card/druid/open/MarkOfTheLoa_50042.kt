package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkOfTheLoa_50042 : Card() {
    override val id = 50042
    override val name = "神灵印记"
    override val description = "<b>抉择：</b> 使一个随从获得+2/+4和<b>嘲讽</b>；或者召唤两个3/2的迅猛龙。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "没错，最强的洛阿神灵，名字就叫印记。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75dd74adcd53112183536a00e1384a3b06c4d9c4234848a4678ca8e7e03d6267.png"
}
